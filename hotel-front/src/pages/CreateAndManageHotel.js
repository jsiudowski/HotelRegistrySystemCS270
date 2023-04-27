import axios from 'axios';
import { useNavigate, useParams, Link } from 'react-router-dom';
import React, {useState, useEffect} from 'react'

export default function Home() {

  const {id} = useParams();
  let navigate = useNavigate();

  const onCreate = async (e) => {
    console.log(id);
    navigate(`/HotelCreator/${id}`);
  }

  const [hotels , setHotels]=useState([]);

  useEffect(()=> {
    loadHotels();
  }, []);

  const loadHotels=async()=>{
    let result=await axios.get("http://localhost:8080/hotels");
    console.log(result);
    setHotels(result.data);
  }

  const {hotel_Name,amenities,location} = hotels;

  return (
    <div className='container'>
      <div className='py-4'>
        <label>Hotels</label>
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">ID #</th>
              <th scope="col">Ammenities</th>
              <th scope="col">Location</th>
              <th scope="col">Hotel Name</th>
              <th scope="col">Number of Employees</th>
            </tr>
          </thead>
          <tbody>
            {
              hotels.map((hotel,index)=>(
                <tr>
                <th scope="row" key={index}>{index+1}</th>
                <td>{hotel.amenities}</td>
                <td>{hotel.location}</td>
                <td>{hotel.hotel_name}</td>
                <td>{hotel.num_employees}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
        </div>
      <div className='py-4'>
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
        <button onClick={(e) => onCreate()}>Create Hotel</button>
        </div>
      </div>
    </div>
  )
}
