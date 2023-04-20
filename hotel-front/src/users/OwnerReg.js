import React from 'react'

export default function OwnerReg() {

    

  return (
    <div className="Container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow"></div>
            <form>
                <div className="mb-3">
                    <label htmlFor="ssn" className="form-label">Social Security</label>
                    <input type={"text"} className="form-control" name="ssn" placeholder="Enter Social" /*value={ssn} onChange={(e)=>onInputChange(e)}*/></input>
                </div>
            </form>
        </div>
    </div>
  )
}
