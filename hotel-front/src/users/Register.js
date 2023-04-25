import axios from 'axios';
import React, {useState} from 'react';
import { useNavigate } from 'react-router-dom';

export default function Register() {

    let navigate=useNavigate();


    //Object for users and useState React Hooks
    const [user, setUser]=useState({
        status:"",
        name:"",
        age:"",
        address:"",
        userName:"",
        password:"",

    })
    
    //Sets input values to user information at registration, check value attribute in inputs
    const{name,age,address,userName,password,status}=user;

    //Function that inputs the user data into the json object when the inputs are updates
    const onInputChange=(e)=>{
        setUser({...user,[e.target.name]:e.target.value});
    }


    //Need to add a if check on status to create employee object. To implement owner, add admin property to employee.java
    const onSubmit= async (e)=>{
        e.preventDefault();

        if(status === "Customer") {
            let response = await axios.post("http://localhost:8080/customer", user);
            navigate(`/CustomerLanding/${response.data.customerID}`);
        }

        else if (status === "Employee" || status === "Owner") {
            if (status === "Owner") {
                const emp = {
                    ...user,
                    isAdmin:"true",
                    position:"Owner"
                }

                //Duplicate code, compatible with leading owners to different pages
                let response = await axios.post("http://localhost:8080/employee", emp);
                navigate(`/OwnerLanding/${response.data.employeeId}`);
            }
            else {
                let response = await axios.post("http://localhost:8080/employee", user);

                navigate(`/EmployeeLanding/${response.data.employeeId}`);
            }

        }
    }



  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Register</h2>
                <form onSubmit={(e)=>onSubmit(e)}>
                    <div className="mb-3">
                        <label htmlFor="Name" className="form-label">
                            Name
                        </label>
                        <input type={"text"} className="form-control" name="name" placeholder="Enter Name" value={name} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="Age" className="form-label">
                            Age
                        </label>
                        <input type={"number"} className="form-control" name="age" placeholder="Enter Age" value={age} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="Address" className="form-label">
                            Address
                        </label>
                        <input type={"text"} className="form-control" name="address" placeholder="Enter Address" value={address} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="Username" className="form-label" >
                            Username
                        </label>
                        <input type={"text"} className="form-control" name="userName" placeholder="Enter Username" value={userName} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="Password" className="form-label">
                            Password
                        </label>
                        <input type={"password"} className="form-control" name="password" placeholder="Enter Password" value={password} onChange={(e)=>onInputChange(e)}></input>
                    </div>
                    <label className="form-label" htmlFor="RadioChecker">
                            Status
                    </label>


                    <div className="border rounded p-4 mt-2 form-group" id="RadioChecker" onChange={(e)=>onInputChange(e)} value={status}>
                        <label className="mb-2">User Type</label>
                        <select name="status" className="form-control">
                            <option>--- Select User Type ---</option>
                            <option value={"Customer"}>Customer</option>
                            <option value={"Employee"}>Employee</option>
                            <option value={"Owner"}>Owner</option>
                        </select>

                        <div className="btn">
                            <button type={"submit"} className="btn btn-outline-dark mx-2">Submit</button>
                            <button type={"reset"} className="btn btn-outline-danger mx-2">Reset</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
  )
}
