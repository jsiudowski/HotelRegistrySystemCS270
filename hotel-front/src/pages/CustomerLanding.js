import React, { useState } from 'react'
import { useParams } from 'react-router-dom'
import axios from 'axios';

export default function CustomerLanding() {

  //Initialize state variable, JSON, reservation with empty default properties
  const [reservation, setReservation] = useState({
    customer:"",
    hotel:"",
    room:"",
    startDate:"",
    endDate:"",
    isCheckedIn:"",
    numGuests:""
  });

  //Initialize hotel as state variable
  const [hotel, setHotel] = useState("");
  const [room, setRoom] = useState("");

  //Function to get the hotel object from DB
  const hotelGrabber = async (hotelId) => {
    return await axios.get(`http://localhost:8080/hotel/${hotelId}`);
  }

  //Function to get room object from DB
  //ROOMS NEED TO BE CREATED
  const roomGrabber = async (roomId) => {
    return await axios.get(`http://localhost:8080/room/${roomId}`);
  }

  
  const {id: customer} = useParams();

  const onHotelChange=(e)=> {
    let h = hotelGrabber(e);
    setHotel(h);
  }

  const onInputChange=(e)=>{
    setReservation({
      customer:customer,
      hotel:hotel,
      room:room,
      ...reservation,
      [e.target.name]:e.target.value});
} 


  return (
    <div>
      <div className='container'>
          <div className='py-4'>
              <header>
              <h1>Customer Landing Page </h1>
              </header>
              <br/>
              </div>
              <section>
                <h2>Welcome To Your Personalized Homepage</h2>
                <span>Create Custom Reservations for any occasion</span>
                <br/>
              </section>
              <br/>
              <div>Create Reservation
              <br/><br/>
              <span>Enter State</span>
              <br/>
              <input type = {"text"} placeholder="Enter Hotel Id"></input>
              <br/>
              <span>Enter City</span>
              <br/>
              <input type = {"text"}  placeholder="Enter City"></input>
              <br/>
              <span>Enter zip</span>
              <br/>
              <input type = {"text"}  placeholder="Enter Zip"></input>
              </div>
              <br/>
              <section>Hotel Info
                <div className="col-mid-6 offset-mid-3 border rounded p-4 mt-2 shadow">
                <br/>
                  <div className="mb-4">
                  <span>Enter Floor Number</span>
                  <br/>
                  <input type = {"text"}  placeholder="Floor Number"></input>
                  <br/>
                  <span>Enter Room Number</span>
                  <br/>
                  <input type = {"text"}  placeholder="Room Number"></input>
                  </div>
                </div>
              </section>
        </div>
    </div>
            
  )
}
