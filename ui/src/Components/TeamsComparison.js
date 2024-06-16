import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import "./TeamComparision.css"
function TeamsComparison ()
{
const[team,setTeam]=useState("");

const[TeamData,setTeamData]=useState("");

// function changeHandler(event)
// {
// setTeam(event.target.value);
// }

function chaneHandler(value)
{
 // console.log(value);
  setTeam(value);
  console.log(team)
}



 useEffect( ()=>{
  const fetchData = async()=>{
  console.log(team);

  try{
   // const response= await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all2/Data/${team}`)
    const response= await fetch(`http://localhost:8011/all2/Data/${team}`);
    if(!response.ok)
      {throw new Error('Network response was not ok');}

      const data= await response.json();
      console.log(data);
      //setTeam(data);
      setTeamData(data);

  }
  catch (error) {
   console.error('Error fetching data:', error.message);}
  /*finally {
   setLoading(false);    }*/
  };

  if(team){
  fetchData();
  }

 },[team]);


 if(TeamData==="")
 {
  return (
<div>

    <button className="bbt" onClick={()=>chaneHandler("Mumbai Indians")}>Mumbai Indians</button>
    <button  className="bbt" onClick={()=>chaneHandler("Chennai Super Kings")}>Chennai Super Kings</button>
    <button  className="bbt" onClick={()=>chaneHandler("Rajasthan Royals")}>Rajasthan Royals</button>
    <button  className="bbt" onClick={()=>chaneHandler("Punjab Kings")}>Punjab Kings</button>
    <button  className="bbt" onClick={()=>chaneHandler("Delhi Capitals")}>Delhi Capitals</button>
    <button  className="bbt" onClick={()=>chaneHandler("Gujrat Titans")}>Gujrat Titans</button>
    <button  className="bbt" onClick={()=>chaneHandler("Kolkata Knight Riders")}>Kolkata Knight Riders</button>
    <button  className="bbt" onClick={()=>chaneHandler("Sunrisers Hyderabad")}>Sunrisers Hyderabad</button>
    <button  className="bbt" onClick={()=>chaneHandler("Royal Challengers Bangalore")}>Royal Challengers Bangalore</button>
    <button  className="bbt" onClick={()=>chaneHandler("Lucknow Super Giants")}>Lucknow Super Giants</button>
    <button  className="bbt" onClick={()=>chaneHandler("Gujarat Lions")}>Gujarat Lions</button>
    <button  className="bbt" onClick={()=>chaneHandler("Deccan Chargers")}>Deccan Chargers</button>
    <button  className="bbt" onClick={()=>chaneHandler("Rising Pune Supergiant")}>Rising Pune Supergiant</button>
    



    </div>


    
  );
 }

return(
<div>
 
              <div>
                

                <h2 id="hh">  {team}</h2>
                <table id="tab">
                  <thead>
                    <tr>
                      <th>Team</th>
                      <th>Match Played</th>
                      <th>MAtch Won</th>
                      <th>Match Lost</th>
                      <th>No Result</th>
                      <th>Toss Won</th>
                    </tr>
                  </thead>

                  <tbody>

                     <tr >
                       <td>{TeamData.teamName}</td>
                       <td>{TeamData.matchPlayed}</td>
                       <td>{TeamData.totalWins}</td>
                       <td>{TeamData.totalLoss}</td>
                       <td>{TeamData.noResult}</td>
                       <td>{TeamData.tossWon}</td>

                     </tr>

                  </tbody>

                </table>
                <h1 id="hh1">Recent Matches of {TeamData.teamName}</h1>
                <table id="tab">
                  <thead>
                    <tr>
                      <th>Date</th>
                      <th>Venue</th>
                      <th>Against</th>
                      <th>Result</th>
                      <th>Margin</th>
                      <th>playerOfMatch</th>
                    </tr>
                  </thead>
                  <tbody>
                    {
                      TeamData.iplmatchList && TeamData.iplmatchList.map(match=>
                      (<tr>
                        <td>{match.date}</td>
                        <td>{match.venue}</td>
                        <td>{match.team1}</td>
                        <td>{match.result}</td>
                        <td>{match.margin} {match.wonByRunsOrWicket}</td>
                        <td>{match.playerOFMatch}</td>
                      </tr>

                      )
                      )

                    }
                  </tbody>
                </table>
                
              </div>
             <span ><Link  id="btt11" to={`/teamDetails/${team}`}>Show More</Link></span>
            

</div>
);

}
export default TeamsComparison