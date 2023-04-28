import React from "react";

export default function ContactUs() {
    return (
        <div className='container'>
            <div className='py-4'>
                <header>
                    <h1>Contact Us</h1>
                </header>
                <br/>
                <br/>
                <main>
                    <section id="contact-info">
                        <h2>Contact Information</h2>
                        <span><strong>Address:</strong> 1 John Carroll Blvd, University Heights, OH 44118</span>
                        <br/>
                        <span><strong>Phone:</strong> (123) 456-7890</span>
                        <br/>
                        <span><strong>Email:</strong> infiniteloopcs270@gmail.com</span>
                        <br/>
                        <a href = "mailto: infiniteloopcs270@gmail.com">Email Us!</a>
                        
                    </section>
                </main>
            </div>
        </div>
    );
}