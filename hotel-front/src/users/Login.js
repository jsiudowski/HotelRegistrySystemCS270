import React from 'react'

export default function LoginForm() {
  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Login</h2>
                <div className="mb-3">
                    <label htmlFor="Name" className="form-label">
                        Username
                    </label>
                    <input type={"text"} className="form-control" placeholder="John Doe" name="Username"></input>
                </div>
                <div className="mb-3">
                    <label htmlFor="Password" className="form-label">
                        Password
                    </label>
                    <input type={"password"} className="form-control" name="Password"></input>
                </div>
            </div>    
        </div>        
    </div>
  )
}
