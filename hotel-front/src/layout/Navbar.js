import React from 'react'
import { Link } from 'react-router-dom'

export default function Navbar() {
  return (
    <div>

        <nav className="navbar navbar-expand-lg navbar-light navbar-dark bg-info">
            <div className="container-fluid">
              <Link className="navbar-brand" to="/">IL Hotel Manager</Link>

              <div className="btn-group">  
                <Link className="btn btn-outline-light" to="/aboutus">About Us</Link>

                <Link className="btn btn-outline-light" to="/contactus">Contact Us</Link>

                <Link className="btn btn-outline-light" to="/login">Log In</Link>

                <Link className="btn btn-outline-light" to="/Create/ManageHotel">Create / Manage Hotels</Link>

              </div>
            </div>
        </nav>
    </div>
  )
}
