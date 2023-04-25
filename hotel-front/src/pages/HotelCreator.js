import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import axios from 'axios';

export default function HotelCreator() {

    let navigate = useNavigate();
    const {id} = useParams();
    
    const [hotel, setHotel] = useState({
        hotelName:"",
        amenities:"",
        location:""
    });

    const {hotelName,amenities,location} = hotel;

    const onInputChange=(e)=>{
        setHotel({...hotel,[e.target.name]:e.target.value});
        //amenities.split("[\\s,]+");
    }

    const onSubmit= async (e) => {
        console.log(hotel);
        e.preventDefault();
        await axios.post("http://localhost:8080/hotel", hotel);
        navigate(`/OwnerLanding/${id}`);
    }

  return (

    <div className="container">
        <h1>Hotel Creator</h1>
        <form onSubmit={(e)=>onSubmit(e)}>
            <label htmlFor='hotelName' className="form-label">Hotel Title:</label>
            <input type={"text"} className="form-control" name="hotelName" placeholder="Enter Name" for={hotelName} onChange={(e)=>onInputChange(e)}></input>

            <label htmlFor='amenities' className="form-label">Hotel Amenities:</label>
            <input type={"text"} className="form-control" name="amenities" placeholder="Enter Amenites" for={amenities} onChange={(e)=>onInputChange(e)}></input>

            <label htmlFor='location' className="form-label">Hotel Location:</label>
            <input type={"address"} className="form-control" name="location" placeholder="Enter Location" for={location} onChange={(e)=>onInputChange(e)}></input>

            <div className="btn">
                <button type={"submit"} className="btn btn-outline-dark mx-2">Submit</button>
                <button type={"reset"} className="btn btn-outline-danger mx-2">Reset</button>
            </div>
        </form>
    </div>
  )
}
