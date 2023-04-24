import React from 'react'


export default function HomePage() {
  return (
    <div className = 'container'>
        <div className='py=4'>
          <header>
            <h1>Infinite Rooms</h1>
          </header>

          <br/>

          <main>
              <section id="find-room">
                <h2>Find A Room</h2>
                
                  <div className ='location'>
                    <div className= "col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                    <h2 className="text-center m-4">Where to?</h2>
                    <div className="mb-4">
                        <label htmlFor="location" className="form-location">
                        </label>
                        <input type={"text"} className="form-control" name="location" placeholder="Location"></input>
                    </div>
                    </div>
                  </div>

              </section>
          <br/>
              <section id="register-hotel">
                <h2>Register A Hotel</h2>

              </section>
          </main>

        </div>
    </div>
  )
}
