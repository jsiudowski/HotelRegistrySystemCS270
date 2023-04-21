import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

export default function EmployeeReg() {

  let navigate=useNavigate();

  const [user, editUser] = useState({
    position:"",
    ssn:""    
  });

  const [position,ssn] = user

  const onInputChange=(e)=>{
    editUser({...user,[e.target.name]:e.target.value});
}

    

  return (
    <div className="Container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow"></div>
            <form>
                <div className="mb-3">
                    <label htmlFor="ssn" className="form-label">Social Security</label>
                    <input type={"text"} className="form-control" name="ssn" placeholder="Enter Social" value={ssn} /*onChange={(e)=>onInputChange(e)}*/></input>
                </div>
            </form>
        </div>
    </div>
  )
}
