import React from 'react';
import { Link} from 'react-router-dom';
import "./NavBar.css"
import csk from "../Images/csk-logo-2022-jpg.jpg"
import rcb from "../Images/wp7498656.webp"
import mi from "../Images/Mumbai_Indians_Logo.svg.png"
import kkr from "../Images/13683c135faf798e8b30954673c3b100.jpg"
import gt from "../Images/gujarattitansslogo_1200x768.webp"
import rr from "../Images/Rajasthan_Royals_Logo.svg.png"
import lsg from "../Images/IPL-Tickets-Lucknow.jpg"
import punjab from "../Images/Punjab_Kings_Logo.svg.png"
import dc from "../Images/Delhi_Capitals.svg.png"
import srh from "../Images/Sunrisers_Hyderabad.png"

function Navbar() {
  return (
    <div>
      <h1 id="hh1"> IPL DashBoard</h1>
      <table >
       <thead>
          <tr className="th1">
             <th className="th1"><Link to="/">Home </Link></th>
             
             <th className="th1"><Link to="/teampage">Teams </Link></th>
             <th className="th1"> <Link to="/matchpage">Matches </Link></th>
             <th className="th1"><Link to="/players/">Players </Link></th>
             <th className="th1"><Link to="/MatchScoreCard">MatchScoreCard</Link></th>
             <th className="th1"><Link to="/CompareTeams">Compare Teams</Link></th>
             
             
             
             
          </tr>
       </thead>
    </table>
    <table>
      <tr>
         <td ><Link to={`/teamDetails/Chennai Super Kings `}><img  height="300" width="200" src={csk}/></Link></td>
         <td><Link to={`/teamDetails/Royal Challengers Bangalore`}><img height="300" width="200" src={rcb}/></Link></td>
         <td><Link  to={`/teamDetails/Mumbai Indians`}><img height="300" width="200" src={mi}></img></Link></td>

         <td><Link to={`/teamDetails/Kolkata Knight Riders`} ><img height="300" width="200" src={kkr}/></Link></td>
         <td><Link to={`/teamDetails/Gujarat Titans`}><img height="300" width="200" src={gt}/></Link></td>
        

      </tr>
      <tr>
        <th><Link to={`/teamDetails/Chennai Super Kings`}>Chennai Super Kings</Link> </th>
         
        <th><Link to={`/teamDetails/Royal Challengers Bangalore`}>Royal Challengers Bangalore</Link></th>
        <th><Link to={`/teamDetails/Mumbai Indians`}>Mumbai Indians</Link></th>
        <th><Link to={`/teamDetails/Kolkata Knight Riders`}>Kolkata Knight Riders</Link></th>
        <th><Link to={`/teamDetails/Gujarat Titans`}>Gujarat Titans</Link></th>
      </tr>

      <tr>
         <td><Link  to={`/teamDetails/Rajasthan Royals`}><img height="300" width="200" src={rr}/></Link></td>
         
         <td><Link to={`/teamDetails/Lucknow Super Giants`}><img height="300" width="200" src={lsg}/></Link></td>

       
       <td><Link to={`/teamDetails/Punjab Kings`}><img height="300" width="200" src={punjab}></img></Link></td>
       <td><Link to={`teamDetails/Delhi Capitals`}><img height="300" width="200" src={dc}></img></Link></td>
       <td><Link to={`/teamDetails/Sunrisers Hyderabad`}><img height="300" width="200" src={srh}></img></Link></td>


         
      </tr>
      <tr>
         <th><Link to={`/teamDetails/Rajasthan Royals`}>Rajasthan Royals</Link></th>
         <th><Link to={`/teamDetails/Lucknow Super Giants`}>Lucknow Super Giants</Link></th>
         <th><Link to={`/teamDetails/Punjab Kings`}>Punjab Kings</Link></th>
         <th><Link to={`/teamDetails/Delhi Capitals`}>Delhi Capitals</Link></th>
         <th><Link to={`/teamDetails/Sunrisers Hyderabad`}>Sunrisers Hyderabad</Link></th>
         
      </tr>
      
    </table>



    </div>
  );
}

export default Navbar;