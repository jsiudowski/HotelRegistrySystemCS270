import React, { useEffect, useState } from "react";
import axios from "axios";

export default function Home() {

  const [customers,setCustomers]=useState([]);
  const [employees,setEmployees]=useState([]);
  const [owners,setOwners]=useState([]);

  useEffect(()=> {
    loadCustomers();
    loadEmployees();
    loadOwners();
  }, []);

  const loadCustomers=async()=>{
    const result=await axios.get("http://localhost:8080/customers");
    setCustomers(result.data);
  }

<<<<<<< Updated upstream
  //In order to get owners, there is a way to do a sort of SQL WHERE statement with axios. I don't recall how but...

=======
>>>>>>> Stashed changes
  const loadEmployees=async()=>{
    const result=await axios.get("http://localhost:8080/employees");
    setEmployees(result.data);
  }

  const loadOwners=async()=>{
    const result=await axios.get("http://localhost:8080/employees");
    setOwners(result.data);
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
        <div className='py-4'>
          <label>Employees</label>
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Age</th>
              <th scope="col">Address</th>
              <th scope="col">Is Admin?</th>
            </tr>
          </thead>
          <tbody>
            {
              employees.map((employee,index)=>(
                <tr>
                <th scope="row" key={index}>{index+1}</th>
                <td>{employee.name}</td>
                <td>{employee.age}</td>
                <td>{employee.address}</td>
                <td>{employee.isAdmin}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
        </div>
        <div className='py-4'>
          <label>Owners</label>
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Age</th>
              <th scope="col">Address</th>
              <th scope="col">Is Admin?</th>
            </tr>
          </thead>
          <tbody>
            {
              owners.map((owner,index)=>(
                <tr>
                <th scope="row" key={index}>{index+1}</th>
                <td>{owner.name}</td>
                <td>{owner.age}</td>
                <td>{owner.address}</td>
                <td>{owner.isAdmin}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
        </div>
    </div>
  )
}
