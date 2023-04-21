import { Button } from 'bootstrap';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

export default function Owner() {
    let navigate=useNavigate();

  const [user, editUser] = useState({
    position:"",
    ssn:""    
  });

  const [position,ssn] = user

  const onInputChange=(e)=>{
    editUser({...user,[e.target.name]:e.target.value});

  const onSubmit= async (e)=>{
    e.preventDefault();

    await axios.post("http://localhost:8080/owner", emp);
    navigate("/OwnerHomePage");


  }
}

    

  return (
    <div className="Container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow"></div>
            <form>
                <div className="mb-3">
                    <label htmlFor="ssn" className="form-label">Social Security</label>
                    <input type={"text"} className="form-control" name="ssn" placeholder="Enter Social" value={ssn} /*onChange={(e)=>onInputChange(e)}*/></input>
                    <label className="form-label" htmlFor="RadioChecker">
                            Status
                    </label>
                </div>
                <div className="border rounded p-4 mt-2" id="Submit">
                        <form onChange={(e)=>onInputChange(e)} value={Status}>

                        </form>
                </div>
                <div className="btn">
                            <button type={"submit"} className="btn btn-outline-dark mx-2">Submit</button>
                </div>
            </form>
        </div>
    </div>
  )
}