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
    let result=await axios.get("http://localhost:8080/customers");
    setCustomers(result.data);
  }


  //Creates a sortBy function that taskes a payload and position string
  const sortBy = (result, positionFilter, nullBool) => {
    const sortedArray = [];
    
    for (const x of result.data) {
      if (nullBool && x.position !== positionFilter){
        sortedArray.push(x);
      }
      else if ( !nullBool && x.position === positionFilter) {
        sortedArray.push(x);
      }

    }
    return sortedArray;
  }


  //Funcitons to load the different kinds of user objects
  const loadEmployees=async()=>{
    let result=await axios.get("http://localhost:8080/employees");
    let employeeArray = sortBy(result, "Owner", true);
    console.log("Emp: ", employeeArray);
    setEmployees(employeeArray);
  }

  const loadOwners=async()=>{
    let result=await axios.get("http://localhost:8080/employees");
    let ownerArray = sortBy(result, "Owner");
    console.log(ownerArray);
    setOwners(ownerArray);
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
              <th scope="col">Position</th>
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
                <td>{employee.position}</td>
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
                </tr>
              ))
            }
          </tbody>
        </table>
        </div>
    </div>
  )
}
