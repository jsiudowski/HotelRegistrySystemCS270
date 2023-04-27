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
import UserControl from './pages/UserControl';
import CustomerLanding from './pages/CustomerLanding';
import EmployeeLanding from './pages/EmployeeLanding';
import OwnerLanding from './pages/OwnerLanding';
import HotelCreator from './pages/HotelCreator';
import SandwichEasterEgg from './pages/SandwichEasterEgg';
import CreateAndManageHotel from './pages/CreateAndManageHotel';

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
        <Route exact path="/EmployeeReg/:id" element={<EmployeeReg/>}/>
        <Route exact path="/UserControl" element={<UserControl/>}/>
        <Route exact path="/CustomerLanding/:id" element={<CustomerLanding/>}/>
        <Route exact path="/EmployeeLanding/:id" element={<EmployeeLanding/>}/>
        <Route exact path="/OwnerLanding/:id" element={<OwnerLanding/>}/>
        <Route exact path="/HotelCreator/:id" element={<HotelCreator/>}/>
        <Route exact path="/SandwichEasterEgg/:id" element={<SandwichEasterEgg/>}/>
        <Route exact path="/CreateAndManageHotel/:id" element={<CreateAndManageHotel/>}/>
      </Routes>
      
      </Router>
    </div>
  );
}

export default App;
