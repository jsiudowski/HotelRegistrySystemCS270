import React from 'react'
import { useNavigate, useParams } from 'react-router-dom'
//import axios from 'axios';

export default function OwnerLanding() {

  //const user = axios.get(`http://localhost:8080/employee/${useParams.id}`)
  //If there is a desire to retrieve all user info, use this

  const {id} = useParams();
  //Destructures the object that comes from useParams. This function just grabs the info from the url


  let navigate = useNavigate();

  const onCreate = async (e) => {
    console.log(id);
    navigate(`/HotelCreator/${id}`);
  }

  const onManage = async (e) => {
    console.log(id);
    navigate(`/CreateAndManageHotel/${id}`);
  }

  return (
    <div className="container">
        <h1>Welcome *insert name*</h1>
        <div>
            <button onClick={(e) => onCreate()}>Create Hotel</button>
            <button onClick={(e) => onManage()}>Manage Hotels</button>
            <button onClick={(e) => onManage()}>Edit Hotel</button>
        </div>
    </div>
  )
}
