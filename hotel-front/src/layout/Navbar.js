import React from 'react'
import { Link } from 'react-router-dom'

export default function Navbar() {
  return (
    <div>

        <nav className="navbar navbar-expand-lg navbar-light navbar-dark bg-info">
            <div className="container-fluid">
              <Link className="navbar-brand" to="/">IL Hotel Manager</Link>

              <div className="btn-group">  
                <button className="btn btn-outline-light">About Us</button>

                <button className="btn btn-outline-light">Contact Us</button>

                <Link className="btn btn-outline-light" to="/login">Log In</Link>

              </div>
            </div>
        </nav>
    </div>
  )
}
