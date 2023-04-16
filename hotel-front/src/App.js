import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom"; 
import Login from './users/Login';
import Register from './users/Register';

function App() {
  return (
    <div className="App">
      <Router>
      
      <Navbar/>

      <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/login" element={<Login/>}/>
        <Route exact path="/register" element={<Register/>}/>
      </Routes>
      
      </Router>
    </div>
  );
}

export default App;
