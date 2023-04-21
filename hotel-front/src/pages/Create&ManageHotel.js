
import { useNavigate } from 'react-router-dom';
import React, {useState} from 'react'
import React from 'react'

const onSubmit= async (e)=>{
  e.preventDefault();

}

export default function Home() {
  return (
    <div className='container'>
      <div className='py-4'>
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
            <h2 className="text-center m-4">Create Hotel</h2>
            <form onSubmit={(e)=>onSubmit(e)}>
            <label htmlFor="Name" className="form-label">
                    Hotel Name
            </label>
            <input type={"text"} className="form-control" name="HotelName" placeholder="Enter Name" value={hotelname} onChange={(e)=>onInputChange(e)}></input>            <div className="mb-3"></div>

            </form>
        </div>
      </div>
    </div>
  )
}
