import React from 'react'

export default function CustomerLanding() {
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
              <input type = {"text"} placeholder="Enter State"></input>
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
