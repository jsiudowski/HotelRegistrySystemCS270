import React, { useEffect, useState } from "react";
import axios from "axios";

export default function AboutUs() {
    return (
        <div className='container'>
            <div className='py-4'>
                <header>
                <h1>About Us</h1>
                </header>
                <br/>
                <main>
                <section id="our-story">
                    <h2>Our Story</h2>
                    <p>We are doing this as a dedicated project for a course called CS270 Software Development Practices, AKA Powerpoint Class</p>
                </section>
                <br/>
                <section id="team">
                    <h2>Our Team</h2>
                    <span>Jon Siudowski - CEO</span>
                    <br/>
                    <span>Vincent Wawak - CEO</span>
                    <br/>
                    <span>Abedelhadi Tawill - CEO</span>
                    <br/>
                    <span>Ananda Abeyesundere - CEO</span>
                    <br/>
                    <span>Gavin Weiser - Janitor/Kitten Master</span>
                </section>
                <br/>
                <section id="mission">
                    <h2>Our Mission</h2>
                    <p>Our mission is to provide the best service possible to our customers and to constantly improve our products and services.</p>
                </section>
            
                </main>
            
                <footer>
                    <p>&copy; 2023 Infinite Room, Inc.</p>
                </footer>
        </div>
    </div>
    );
}