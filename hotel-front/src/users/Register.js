import React, {useState} from 'react'

export default function Register() {

    const [user, setUser]=useState({
        name:"",
        age:"",
        address:"",
        username:"",
        password:"",
        status:""
    })

  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Register</h2>
                <div className="mb-3">
                    <label htmlFor="Name" className="form-label">
                        Name
                    </label>
                    <input type={"text"} className="form-control" name="name" placeholder="Enter Name"></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="Age" className="form-label">
                        Age
                    </label>
                    <input type={"number"} className="form-control" name="age" placeholder="Enter Age"></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="Address" className="form-label">
                        Address
                    </label>
                    <input type={"text"} className="form-control" name="address" placeholder="Enter Address"></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="Username" className="form-label" >
                        Username
                    </label>
                    <input type={"text"} className="form-control" name="Username" placeholder="Enter Username"></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="Password" className="form-label">
                        Password
                    </label>
                    <input type={"password"} className="form-control" name="Password" placeholder="Enter Password"></input>
                </div>
                <label className="form-label" htmlFor="RadioChecker">
                        Status
                </label>
                <div className="border rounded p-4 mt-2" id="RadioChecker">
                    <div className="form-check">
                        <input className="form-check-input" type="radio" name="StatusRadio" id="RadioOwner"/>
                        <label className="form-check-label" for="RadioOwner">
                            Owner
                        </label>
                    </div>
                    <div className="form-check">
                        <input className="form-check-input" type="radio" name="StatusRadio" id="RadioEmployee"/>
                        <label className="form-check-label" for="RadioEmployee">
                            Employee
                        </label>
                    </div>
                    <div className="form-check">
                        <input className="form-check-input" type="radio" name="StatusRadio" id="RadioCustomer" />
                        <label className="form-check-label" for="RadioCustomer">
                            Customer
                        </label>
                    </div>
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
