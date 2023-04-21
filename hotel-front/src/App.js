import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import AboutUs from './pages/AboutUs';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom"; 
import Login from './users/Login';
import Register from './users/Register';
import Customer from './users/Customers';
import ContactUs from './pages/ContactUs';
import EmployeeReg from './users/EmployeeReg';

function App() {
  return (
    <div className="App">
      <Router>
      
      <Navbar/>

      <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/aboutus" element={<AboutUs/>}/>
        <Route exact path="/contactus" element={<ContactUs/>}/>
        <Route exact path="/login" element={<Login/>}/>
        <Route exact path="/register" element={<Register/>}/>
        <Route exact path="/customers" element={<Customer/>}/>
        <Route exact path="/EmployeeReg" element={<EmployeeReg/>}/>
      </Routes>
      
      </Router>
    </div>
  );
}

export default App;
