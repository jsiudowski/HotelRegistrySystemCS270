import React from 'react'
import { Link } from 'react-router-dom'


export default function HomePage() {
  return (
    <html>
      <body>
    <div>HomePage
      <div class = "containter">
        <h1></h1>
        <div class ="d-lg-flex flex row"> 
          <div class = "home-page-title-black-border"> Welcome To Infinite Rooms </div>
          <img src ="https://media.cntraveler.com/photos/5be1b38dcfd2bb17f97a7a96/16:9/w_3999,h_2249,c_limit/Monastero-Santa-Rosa-Hotel-&-Spa__2018_MSRdusktviewproperty"></img>

        </div>
        <div class = "home-page-info-black-border">Choose a wide variety of rooms and services across multiple hotels</div>
        
        <button onclick="DoSomething()">Create/Manage Reservations</button>

		<br/>
    <br/>

      </div>  
      <div class = "home-page-bottom-black-border">
        <p1>Some hotels require you to cancel more than 24 hours before check-in. Details on site.</p1> 
        <br/>
        <p2>© 2023 InfiniteRooms.com is an InfiniteLoop company. All rights reserved.
        InfiniteRooms.com and the InfiniteRooms.com logo are trademarks or registered trademarks of InfiniteRooms.com, LP in the United States and/or other countries. All other trademarks are the property of their respective owners.</p2>
        </div>

    </div>

    </body>
  </html>
  )
}  