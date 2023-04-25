import React, {useState} from 'react'
import { Link, useNavigate } from 'react-router-dom'
import axios from 'axios'


export default function LoginForm() {

    let navigate=useNavigate();

    const [login, setLogin] = useState({
        userName:"",
        password:"",
    })

    const onInputChange=(e)=>{
        setLogin({...login,[e.target.name]:e.target.value});
    }

    const {userName, password} = login;

    const onSubmit= async (e)=>{
        e.preventDefault();

        const customerResponse = await axios.get("http://localhost:8080/customers");
        const employeeResponse = await axios.get("http://localhost:8080/employees");
        const employees = employeeResponse.data;
        const customers = customerResponse.data;

        for (let i = 0; i < employees.length; i++) {

            if (employees[i].userName === userName && employees[i].password === password) {

                if (employees[i].position === "Owner") {
                    navigate(`/OwnerLanding/${employees[i].employeeId}`);
                }
                else {
                    navigate(`/EmployeeLanding/${employees[i].employeeId}`);
                }

                
                
            }
            else {
                continue
            }

        }
        for (let i = 0; i < customers.length; i++) {
            if (customers[i].userName === userName && customers[i].password === password) {
                navigate(`/CustomerLanding/${customers[i].customerID}`);
                break
            }
            else {
                continue
            }
        }

    }

  return (
    <div className="container">
        <form onSubmit={(e)=>onSubmit(e)}>
            <div className="row">
                <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                    <h2 className="text-center m-4">Login</h2>
                    <div className="mb-3">
                        <label htmlFor="userName" className="form-label">
                            Username
                        </label>
                        <input type={"text"} className="form-control" name="userName" placeholder="Username" value={userName} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="password" className="form-label">
                            Password
                        </label>
                        <input type={"password"} className="form-control" name="password" placeholder="Password" value={password} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                </div>    
            </div>
            <div className="btn row mt-3">
                <button type={"submit"} className="btn btn-outline-success">Login</button>
                <label htmlFor="Register" className="form-label p-2">
                    Don't have an account?
                </label>
                <Link className="btn btn-outline-dark" to="/register" >Register</Link>
            </div>  
        </form>      
    </div>
  )
}
