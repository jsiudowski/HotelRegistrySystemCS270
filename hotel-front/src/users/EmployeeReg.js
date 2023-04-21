import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';

export default function EmployeeReg() {

  let navigate=useNavigate();

  const {id} = useParams()

  //Regex for social secutiry
  let regex = new RegExp(/^(?!666|000|9\d{2})\d{3}-(?!00)\d{2}-(?!0{4})\d{4}$/);
  
  const onSubmit= async (e)=>{
    e.preventDefault();

    await axios.put(`http://localhost:8080/employee/${id}`, user);
    navigate("/");
  }


  const [user, editUser] = useState({
    ssn:""    
  });

  let ssn;

  const onInputChange=(e)=>{
    editUser({...user,[e.target.name]:e.target.value});
}


    

  return (
    <div className="container">
      <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
      <h2>Finish Your Registration!</h2>
        <form onSubmit={(e)=>onSubmit(e)}>
          <div className="mb-3">
              <label htmlFor="ssn" className="form-label">
                  Social Security
              </label>
              <input type={"text"} className="form-control" name="ssn" placeholder="Social Security" pattern={regex} value={ssn} onChange={(e)=>onInputChange(e)}></input>
            </div>
        </form>
      </div>
    </div>
  )
}
