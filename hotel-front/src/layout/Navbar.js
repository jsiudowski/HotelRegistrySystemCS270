import React from 'react'

export default function Navbar() {
  return (
    <div>

        <nav className="navbar navbar-expand-lg navbar-light navbar-dark bg-info">
            <div className="container-fluid">
                <a href="#" className="navbar-brand">IL Hotel Manager</a>

                <button className="btn btn-outline-light">Log In</button>

                <button className="btn btn-outline-light">About Us</button>

                <button className="btn btn-outline-light">Contact Us</button>

            </div>
        </nav>
    </div>
  )
}
