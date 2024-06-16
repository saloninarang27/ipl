import React, { useEffect, useState } from "react"
import { useParams } from "react-router-dom";
import { Link } from "react-router-dom";
import "./TeamDetails.css"
function TeamDetails()
{   let {team}=useParams();
    let [year,setYear]=useState(2022)
    let[teamMatch,setTeamMatch]=useState("");

   const clickhadler=(year)=>
    {
      setYear(year)
      console.log(year);
      
    }
    useEffect( ()=> {
        const  fetchData = async()=>
        { 
            
           try {
           // console.log("sonu")
            const response = await fetch(`http://localhost:8011/all2/Matches/${year}/${team}`);
            if(!response.ok)
            {throw new Error('Network response was not ok');}
            const data =await response.json();
            console.log(data);
            setTeamMatch(data);
            
      
            
           } catch (error) {
            console.error('Error fetching data:', error.message);
            
           }
        }
        
        fetchData();

    },[year]

    )

    return(
     <div>
          <h1 id="hh1">{team}</h1>

          <button className="bbbb" onClick={ ()=>clickhadler(2022)}>2022</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2021)}>2021</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2020)}>2020</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2019)}>2019</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2018)}>2018</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2017)}>2017</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2016)}>2016</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2015)}>2015</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2014)}>2014</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2013)}>2013</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2012)}>2012</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2011)}>2011</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2010)}>2010</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2009)}>2009</button>
          <button className="bbbb" onClick={ ()=>clickhadler(2008)}>2008</button>


          <div>
           { teamMatch && teamMatch.map(match => (
            
            <div id="dddd">
            <h3>{ match.date}</h3>
               
               {match.team1} vs {match.team2}<br>
               
               </br>
        <pre></pre>
               {match.venue},{match.city}
              
               <br></br>
               {match.result} Won by {match.margin} {match.wonByRunsOrWicket}
               <br></br>
               Player Of the Match : {match.playerOFMatch}
            </div>
                      ))}
                      
          </div>

     </div>
    );
}
export default TeamDetails;