import React, {useState} from 'react'

export default function Register() {


    //Object for users
    const [user, setUser]=useState({
        name:"",
        age:"",
        address:"",
        username:"",
        password:"",
        status:""
    })
    
    //Sets input values to user information at registration, check value attribute in inputs
    const{name,age,address,username,password,status}=user;

    //Function
    const onInputChange=(e)=>{
        setUser({...user,[e.target.name]:e.target.value})
    }

  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Register</h2>
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
                    <input type={"text"} className="form-control" name="username" placeholder="Enter Username" value={username} onChange={(e)=>onInputChange(e)}></input>
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
                <div className="border rounded p-4 mt-2" id="RadioChecker">
                    <form onChange={(e)=>onInputChange(e)} value={status}>
                        <div className="form-check">
                            <input className="form-check-input" type="radio" name="status" id="RadioOwner" value={"Owner"} />
                            <label className="form-check-label" for="RadioOwner">
                                Owner
                            </label>
                        </div>
                        <div className="form-check">
                            
                            <input className="form-check-input" type="radio" name="status" id="RadioEmployee" value={"Employee"} />
                            <label className="form-check-label" for="RadioEmployee">
                                Employee
                            </label>
                        </div>
                        <div className="form-check">
                            <input className="form-check-input" type="radio" name="status" id="RadioCustomer" value={"Customer"} />
                            <label className="form-check-label" for="RadioCustomer">
                                Customer
                            </label>
                        </div>
                    </form>
                </div>
            </div>
            <div className="btn">
                <button type={"submit"} className="btn btn-outline-dark mx-2">Submit</button>
                <button type={"reset"} className="btn btn-outline-danger mx-2">Reset</button>
            </div>
        </div>
    </div>
  )
}
