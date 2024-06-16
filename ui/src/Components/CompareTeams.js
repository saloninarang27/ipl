import React, { useState ,useEffect} from "react";
import "./CompareTeam.css"
import "../Pages/TeamPage.css"
function CompareTeams(){

    let[team1,setTeam1]=useState("")
    let[team2,setTeam2]=useState("")
    let[comparision,setComparision]=useState("")
    let[bt,setbt]=useState(0)
    function changeHandler1(event)
    {
        setTeam1(event.target.value);
    }
    function changeHandler2(event)
    {
        setTeam2(event.target.value);
    }

    function Compare()
    {     bt++;
        setbt(bt);
        console.log(team1,team2)

        console.log(bt)

    }
    useEffect(() => {
        const fetchData = async () => {
          try {
           
            const response = await fetch(`http://localhost:8011/all2/TeamCompare/${team1}/${team2}`);
    
            if (!response.ok ) {
              throw new Error('Network response was not ok');
            }
           
    
    
            const data = await response.json();
    
            console.log(data);
            setComparision(data);
            //console.log(comparision);

    
          } catch (error) {
            console.error('Error fetching data: ', error.message);
          }
        };
       
    
        if (bt) {
          fetchData();
        }
      },[bt]);
    
    if(comparision==="")
    {
      return(
        <div className="CompareTeams"> 
     <h1 id="hh1">Compare Teams</h1>
        <br></br>
<div id="mdiv">
<label>Browse Team1: </label>
     <select className="slt" onChange={changeHandler1}>
     <option className="opt" value=" " disabled hidden> Select Team1</option>
     <option  value=" " disabled hidden> Select Team1</option>
     
     <option value=" " disabled hidden> Select Team1</option>
     <option></option>
      <option value="Mumbai Indians">Mumbai Indians</option>
      <option value="Chennai Super Kings">Chennai Super Kings</option>
      <option value="Rajasthan Royals">Rajasthan Royals</option>
      <option value="Punjab Kings">Punjab Kings</option>
      <option value="Delhi Capitals">Delhi Capitals</option>
      <option value="Gujarat Titans">Gujrat Titans</option>
      <option value="Kolkata Knight Riders">Kolkata Knight Riders</option>
      <option value="Sunrisers Hyderabad">Sunrisers Hyderabad</option>
      <option value="Royal Challengers Bangalore">Royal Challengers Bangalore</option>
      <option value="Lucknow Super Giants">Lucknow Super Giants</option>
      <option value="Pune Warriors">Pune Warriors</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
      <option value="Deccan Chargers">Deccan Chargers</option>
      <option value="Rising Pune Supergiant">Rising Pune Supergiant</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
     </select>
   &nbsp;&nbsp;&nbsp;

     <label>Browse Team2: </label>
     <select className="slt" onChange={changeHandler2}>
     <option value="" disabled hidden> Select Team2</option>
     <option value="" disabled hidden> Select Team2</option>
     <option value=" " disabled hidden> Select Team2</option>
     <option></option>
   
      <option value="Mumbai Indians">Mumbai Indians</option>
      <option value="Chennai Super Kings">Chennai Super Kings</option>
      <option value="Rajasthan Royals">Rajasthan Royals</option>
      <option value="Punjab Kings">Punjab Kings</option>
      <option value="Delhi Capitals">Delhi Capitals</option>
      <option value="Gujarat Titans">Gujrat Titans</option>
      <option value="Kolkata Knight Riders">Kolkata Knight Riders</option>
      <option value="Sunrisers Hyderabad">Sunrisers Hyderabad</option>
      <option value="Royal Challengers Bangalore">Royal Challengers Bangalore</option>
      <option value="Lucknow Super Giants">Lucknow Super Giants</option>
      <option value="Pune Warriors">Pune Warriors</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
      <option value="Deccan Chargers">Deccan Chargers</option>
      <option value="Rising Pune Supergiant">Rising Pune Supergiant</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
     </select>

  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;

     <button className="bts" onClick={Compare}>Compare</button><br></br><br></br>
     </div>
        </div>
      );
    }
    return(
        <div className="CompareTeams">
         
        <h1 id="hh1">Compare Teams</h1>
        <br></br>

<label>Browse Team1: </label>
     <select className="slt" onChange={changeHandler1} value={team1}>
     <option value=" " disabled hidden> Select Team1</option>
     <option value=" " disabled hidden> Select Team1</option>
     
     <option value=" " disabled hidden> Select Team1</option>
     <option></option>
      <option value="Mumbai Indians">Mumbai Indians</option>
      <option value="Chennai Super Kings">Chennai Super Kings</option>
      <option value="Rajasthan Royals">Rajasthan Royals</option>
      <option value="Punjab Kings">Punjab Kings</option>
      <option value="Delhi Capitals">Delhi Capitals</option>
      <option value="Gujarat Titans">Gujrat Titans</option>
      <option value="Kolkata Knight Riders">Kolkata Knight Riders</option>
      <option value="Sunrisers Hyderabad">Sunrisers Hyderabad</option>
      <option value="Royal Challengers Bangalore">Royal Challengers Bangalore</option>
      <option value="Lucknow Super Giants">Lucknow Super Giants</option>
      <option value="Pune Warriors">Pune Warriors</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
      <option value="Deccan Chargers">Deccan Chargers</option>
      <option value="Rising Pune Supergiant">Rising Pune Supergiant</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
     </select>
   &nbsp;&nbsp;&nbsp;

     <label>Browse Team2: </label>
     <select className="slt" onChange={changeHandler2} value={team2}>
     <option value="" disabled hidden> Select Team2</option>
     <option value="" disabled hidden> Select Team2</option>
     <option value=" " disabled hidden> Select Team2</option>
     <option></option>
   
      <option value="Mumbai Indians">Mumbai Indians</option>
      <option value="Chennai Super Kings">Chennai Super Kings</option>
      <option value="Rajasthan Royals">Rajasthan Royals</option>
      <option value="Punjab Kings">Punjab Kings</option>
      <option value="Delhi Capitals">Delhi Capitals</option>
      <option value="Gujarat Titans">Gujrat Titans</option>
      <option value="Kolkata Knight Riders">Kolkata Knight Riders</option>
      <option value="Sunrisers Hyderabad">Sunrisers Hyderabad</option>
      <option value="Royal Challengers Bangalore">Royal Challengers Bangalore</option>
      <option value="Lucknow Super Giants">Lucknow Super Giants</option>
      <option value="Pune Warriors">Pune Warriors</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
      <option value="Deccan Chargers">Deccan Chargers</option>
      <option value="Rising Pune Supergiant">Rising Pune Supergiant</option>
      <option value="Gujarat Lions">Gujarat Lions</option>
     </select>

  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;

     <button className="bts" onClick={Compare}>Compare</button><br></br><br></br>

       <table id="tab">
        <thead>
            <th id="hh1" colSpan="2">{team1} vs {team2}</th>
            <tr>
                <th>Matches Played </th>
                <td id="td1">{comparision.totalMatch}</td>
            </tr>
            <tr>
                <th>{team1} won </th>
                <td id="td1">{comparision.team1MatchWon}</td>
            </tr>
            <tr>
                <th>{team2} won </th>
                <td id="td1">{comparision.team2MatchWon}</td>
            </tr>
            
            <tr>
                <th>{team1} Toss Won </th>
                <td id="td1">{comparision.team1TossWon}</td>
            </tr>
            <tr>
                <th>{team2} Toss Won </th>
                <td id="td1">{comparision.team2TossWon}</td>
            </tr>
            <tr>
                <th>NO Result</th>
                <td id="td1">{comparision.noResult}</td>
            </tr>
        </thead>
       </table>

        </div>
    );

}
export default CompareTeams ;