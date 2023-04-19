import React, { useEffect, useState } from "react";
import axios from "axios";

export default function Customers() {

  const [customers,setCustomers]=useState([]);

  useEffect(()=> {
    loadCustomers();
  }, []);

  const loadCustomers=async()=>{
    const result=await axios.get("http://localhost:8080/customers");
    setCustomers(result.data);
  }

  return (
    <div className='container'>
        <div className='py-4'>
        <label>Customers</label>
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Age</th>
              <th scope="col">Address</th>
            </tr>
          </thead>
          <tbody>
            {
              customers.map((customer,index)=>(
                <tr>
                <th scope="row" key={index}>{index+1}</th>
                <td>{customer.name}</td>
                <td>{customer.age}</td>
                <td>{customer.address}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
        </div>
        </div>
    )
}