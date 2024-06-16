import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom";
import'./MatchFullDetail.css';
function MatchFullDetails()
{  
  let {temp}  = useParams();
  console.log(temp);
   let[id,setid]=useState();
   const [MatchData,setMatchData]=useState("");
   
  // let[data,setData]=useState();
   useEffect( ()=>{
    const fetchData= async()=>{
        try{

        //  const response = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all2/Match/${id}`);
        const response=await fetch(`http://localhost:8011/all2/Match/${id}`);
         //console.log(response);
         if(!response.ok)
         {throw new Error('Network response was not ok');}
   
         const data= await response.json();
         console.log(data);
         setMatchData(data);
         //setData(data);
        
        }
        catch(error)
        {
            console.error('Error fetching data:', error.message);
        }


    }
    id=temp;

    if(id){
        fetchData();
        }
    

   },[id]);



    return(
        <div>
        <h1 id="hh1">Match Details </h1>
        <table className='MatchDetailedTable'>
            <thead>
                <tr>
                    <th>Season</th>
                    <td>{MatchData.year}</td>
                </tr>
                <tr>
                    <th>Match Number</th>
                    <td>{MatchData.matchNumber}</td>
                </tr>
               
                <tr>
                    <th>City</th>
                    <td>{MatchData.city}</td>
                </tr>
                <tr>
                    <th>Venue</th>
                    <td>{MatchData.venue}</td>
                </tr>
                <tr>
                    <th>Team1</th>
                    <td>{MatchData.team1}</td>
                </tr>
                <tr>
                    <th>Team2</th>
                    <td>{MatchData.team2}</td>
                </tr>
                <tr>
                    <th>Toss Winner</th>
                    <td>{MatchData.tossWinner}</td>
                </tr>
                <tr>
                    <th>Toss Decision</th>
                    <td>{MatchData.tossDecision}</td>
                </tr>
                <tr>
                    <th>Match Winner</th>
                    <td>{MatchData.result}</td>
                </tr>
                <tr>
                    <th>Player Of the Match</th>
                    <td>{MatchData.playerOFMatch}</td>
                </tr>
                <tr>
                    <th>Margin</th>
                    <td>{MatchData.margin} {MatchData.wonByRunsOrWicket
                    }</td>
                </tr>
               
                <tr>
                    <th>DLS Mehod</th>
                    <td>{MatchData.method}</td>
                </tr>
                <tr>
                    <th>Umpires</th>
                    <td>{MatchData.umpire1} , {MatchData.umpire2
                    }</td>
                </tr>

            </thead>
        </table>
        </div>
    );
}
export default MatchFullDetails;