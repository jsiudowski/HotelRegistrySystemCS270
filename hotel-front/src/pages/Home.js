import React from 'react';
import { useNavigate } from 'react-router-dom'

export default function HomePage() {


let navigate=useNavigate();

const navigateToCustomerLanding = () => {
  navigate('/login');
}

const navigateToHotelCreator = () => {
  navigate('/login');
}

const navigateToSandwichEasterEgg = () => {
  navigate('/SandwichEasterEgg');
}

  return (
    <div>
      <div class = "containter">
        <div class ="d-lg-flex flex row"> 
          <div class = "home-page-title-black-border"> Welcome To Infinite Loop Services</div>
        </div>
        <img src ="https://media.cntraveler.com/photos/5be1b38dcfd2bb17f97a7a96/16:9/w_3999,h_2249,c_limit/Monastero-Santa-Rosa-Hotel-&-S5%pa__2018_MSRdusktviewproperty"
            width={1300} height={500} alt=""></img> 
        <main>
          <div class="top-left-hotel-location-input-img-load">Find a Location:
          <div className='location'>
            <div className="col-mid-6 offset-mid-3 border rounded p-4 mt-2 shadow">
            <h2>where to?</h2>
            <div className="mb-4">
              <label htmlFor="location" className="form-location"></label>
             <button onClick={navigateToCustomerLanding} className="registry-button-link" name="location">Create Reservation!</button>
            </div>
            </div>
          </div>
          </div>
        </main>
        <br></br>


      </div>
      <div class = "home-page-title-black-border-image"> 
              <img src="https://news.mit.edu/sites/default/files/images/201306/20130603150017-0.jpg"width={940} height={700} alt="">
              </img>
            </div>
            <div class="bottom-img-hotel-creation-input-img-load">Publish a Location:
            <div className='location'>
              <div className="col-mid-6 offset-mid-3 border rounded p-4 mt-2 shadow">
              <h2>Hotel's Location?</h2>
              <div className="mb-4">
                <label htmlFor="location" className="form-location"></label>
                <button onClick={navigateToHotelCreator} className="hotel-creation-button-link" name="location">Create Hotel!</button>
              </div>
              </div>
            </div>
        </div>
      <div>

        
      <main>
        <div class ="sidebox-flex">
            <br></br>
            <div class = "sidebox-flex-items sidebox-item-1"> 
            Choose a wide variety of rooms and services across multiple hotels
            throughout our database!!</div>

            <div class = "sidebox-flex-items"> 
            <button onClick={navigateToSandwichEasterEgg} className="easter-egg-button-link" name="location">
            Countless options all easy to use with no fees necessary  </button>
            </div>
        </div>

        </main>
      </div>  

    </div>

    </body>
  </html>
  )
}  