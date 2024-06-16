


import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import './MatchScoreCard.css'

function MatchScoreCard()
{  
   
    const[id,setId]=useState();
    const[ScoreCard,setScoreCard]=useState("")
    const[BowlingCard,setBowlingCard]=useState("")
    const[year,setYear]=useState();
    const[team1,setTeam1]=useState("");
    const[team2,setTeam2]=useState("");

    
    

    function chaneHandler(event)
    {
       setId(event.target.value);
    }
    function chaneHandler1(event)
    {
      setYear(event.target.value);
      console.log(event.target.value);
    }
    function chaneHandler2(event)
    {
      setTeam1(event.target.value);
      console.log(event.target.value);

    }
    function chaneHandler3(event)
    {
      setTeam2(event.target.value);
      console.log(event.target.value);

    }
    
    useEffect( () =>{

    const fetchData =async()=>{

        try{

            // const response = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all3/getScoreCard/${id});
            // const response2 = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all4/getBowlingCard/${id});
            const response= await fetch(`http://localhost:8011/all3/getScoreCard/${id}`);
            const response2 =await fetch(`http://localhost:8011/all4/getBowlingCard/${id}`)
           
            //console.log(response);
            if(!response.ok|| !response2.ok)
            {throw new Error('Network response was not ok');
            }
           
      
            const data= await response.json();
            const data2=await response2.json();
            // if(data.length=== && data2.length===null)
            // {
                 
            //     
             
            // }
            
            console.log(data);
           console.log(data2)
          
            setScoreCard(data);
            setBowlingCard(data2);



            
           
           }
           catch(error)
           {
               console.error('Error fetching data:', error.message);
           }
   
    };


    if(id)
    {
        fetchData();

    }



    },[id])

    useEffect(
      ()=>{
        const fetchData = async ()=>{
          try {
            
           // const response =await fetch(${process.env.REACT_APP_API_ROOT_URL}/all3/getScoreCardByYearsTeams/${year}/${team1}/${team2});
           const response=await fetch(`http://localhost:8011/all3/getScoreCardByYearsTeams/${year}/${team1}/${team2}`)
            if(!response.ok)
            {throw new Error('Network response was not ok');}
            const data=await response.json();
            console.log(data)
            // if(data.length===0)
            // {
              
            //   alert("NO Match Found!!")
            // }
            if(data.length>0)
             setId(data);
           
           // console.log(id)
           


          } catch (error) {
            console.error('Error fetching data:', error.message);
          }
           
        }
      // if(year,team1,team2)
        fetchData();

      },[year ,team1 , team2 ]


    )

    if(ScoreCard==="" && BowlingCard==="")
    {
      return(
        <div >
               <h1 id="hh1"> MatchScoreCard</h1>

{/* <form>
    <label>Enter Match Id: </label>
    <input value={id} type="number" onChange={chaneHandler}/>
</form> */}
   <label className="lb">Year : </label>
    <select className="lbs" onChange={chaneHandler1}>
    <option >year</option>
    <option value="2023.0">2023</option>
      <option value="2022.0">2022</option>
      <option value="2021.0">2021</option>
      <option value="2020.0">2020</option>
      <option value="2019.0">2019</option>
      <option value="2018.0">2018</option>
      <option value="2017.0">2017</option>
      <option value="2016.0">2016</option>
      <option value="2015.0">2015</option>
      <option value="2014.0">2014</option>
      <option value="2013.0">2013</option>
      <option value="2012.0">2012</option>
      <option value="2011.0">2011</option>
      <option value="2010.0">2010</option>
      <option value="2009.0">2009</option>
      <option value="2008.0">2008</option>
    </select>&nbsp;&nbsp;&nbsp;

    <label className="lb"> Select Team1 : </label>
     <select className="lbs" onChange={chaneHandler2}>
     <option  >Choose Teams</option>
     <option value="MI">Mumbai Indians</option>
      <option value="CSK">Chennai Super Kings</option>
      <option value="RR">Rajasthan Royals</option>
      <option value="KXIP">Punjab Kings</option>
      <option value="DC">Delhi Capitals</option>
      <option value="GT">Gujrat Titans</option>
      <option value="KKR">Kolkata Knight Riders</option>
      <option value="SRH">Sunrisers Hyderabad</option>
      <option value="RCB">Royal Challengers Bangalore</option>
      <option value="LSG">Lucknow Super Giants</option>
      <option value="PWI">Pune Warriors</option>
      <option value="GL">Gujarat Lions</option>
      <option value="DC">Deccan Chargers</option>
      <option value="RPS">Rising Pune Supergiant</option>
      
     </select>&nbsp;&nbsp;&nbsp;

     <label className="lb"> Select Team2 : </label>
     <select className="lbs" onChange={chaneHandler3}>
     <option>Choose Teams</option>
     <option value="MI">Mumbai Indians</option>
      <option value="CSK">Chennai Super Kings</option>
      <option value="RR">Rajasthan Royals</option>
      <option value="KXIP">Punjab Kings</option>
      <option value="DC">Delhi Capitals</option>
      <option value="GT">Gujrat Titans</option>
      <option value="KKR">Kolkata Knight Riders</option>
      <option value="SRH">Sunrisers Hyderabad</option>
      <option value="RCB">Royal Challengers Bangalore</option>
      <option value="LSG">Lucknow Super Giants</option>
      <option value="PWI">Pune Warriors</option>
      <option value="GL">Gujarat Lions</option>
      <option value="DC">Deccan Chargers</option>
      <option value="RPS">Rising Pune Supergiant</option>
      
     </select>
        </div>
      );
    }

    return(
        <div>
            <h1 id="hh1"> MatchScoreCard</h1>

            {/* <form>
                <label>Enter Match Id: </label>
                <input value={id} type="number" onChange={chaneHandler}/>
            </form> */}

            <label className="lb">Year : </label>
    <select  className="lbs" onChange={chaneHandler1}>
    <optoin>year</optoin>
      <option value="2023.0">2023</option>
      <option value="2022.0">2022</option>
      <option value="2021.0">2021</option>
      <option value="2020.0">2020</option>
      <option value="2019.0">2019</option>
      <option value="2018.0">2018</option>
      <option value="2017.0">2017</option>
      <option value="2016.0">2016</option>
      <option value="2015.0">2015</option>
      <option value="2014.0">2014</option>
      <option value="2013.0">2013</option>
      <option value="2012.0">2012</option>
      <option value="2011.0">2011</option>
      <option value="2010.0">2010</option>
      <option value="2009.0">2009</option>
      <option value="2008.0">2008</option>
      </select>

      <label className="lb"> Select Team1 : </label>
     <select className="lbs"onChange={chaneHandler2} value={team1}>
     <option>choose team1</option>
     <option value="MI">Mumbai Indians</option>
      <option value="CSK">Chennai Super Kings</option>
      <option value="RR">Rajasthan Royals</option>
      <option value="KXIP">Punjab Kings</option>
      <option value="DC">Delhi Capitals</option>
      <option value="GT">Gujrat Titans</option>
      <option value="KKR">Kolkata Knight Riders</option>
      <option value="SRH">Sunrisers Hyderabad</option>
      <option value="RCB">Royal Challengers Bangalore</option>
      <option value="LSG">Lucknow Super Giants</option>
      <option value="PWI">Pune Warriors</option>
      <option value="GL">Gujarat Lions</option>
      <option value="DC">Deccan Chargers</option>
      <option value="RPS">Rising Pune Supergiant</option>
      
     </select>&nbsp;&nbsp;&nbsp;
     <label className="lb">Select Team2 : </label>
     <select className="lbs" onChange={chaneHandler3} value={team2}>
     <option>choose team2</option>
     <option value="MI">Mumbai Indians</option>
      <option value="CSK">Chennai Super Kings</option>
      <option value="RR">Rajasthan Royals</option>
      <option value="KXIP">Punjab Kings</option>
      <option value="DC">Delhi Capitals</option>
      <option value="GT">Gujrat Titans</option>
      <option value="KKR">Kolkata Knight Riders</option>
      <option value="SRH">Sunrisers Hyderabad</option>
      <option value="RCB">Royal Challengers Bangalore</option>
      <option value="LSG">Lucknow Super Giants</option>
      <option value="PWI">Pune Warriors</option>
      <option value="GL">Gujarat Lions</option>
      <option value="DC">Deccan Chargers</option>
      <option value="RPS">Rising Pune Supergiant</option>
      
     </select>



          
          

            

            <table className="ScoreCardTable">
              <thead>
                <tr>
                    <th colspan="7">{ScoreCard.team1} vs {ScoreCard.teeam2}</th>
                </tr>
                <tr>
                    <th id="hh1" colspan="7">Batting :  {ScoreCard.team1}</th>
                </tr>
                <tr className="trtag">
                    <th>Batsman Name</th>
                    <th>Runs</th>
                    <th>Balls</th>
                    <th>Strike Rate</th>
                    <th>Fours</th>
                    <th>Sixes</th>
                    <th>Out by</th>
                </tr>
              </thead>
              <tbody>
              {ScoreCard.player_Name_Team1 && ScoreCard.player_Name_Team1.map((player, index) => (
              <tr key={index}>
                <td><Link to={`/PlayerStats2/${player}`}>{player}</Link></td>
                <td>{ScoreCard.player_Runs_Team1[index]}</td>
                <td>{ScoreCard.player_Balls_Team1[index]}</td>
                <td>{ScoreCard.player_StrikeRate_Team1[index]}</td>
                <td>{ScoreCard.player_Fours_Team1[index]}</td>
                <td>{ScoreCard.player_Sixes_Team1[index]}</td>
                <td>{ScoreCard.player_BattingStatus_Team1[index]}</td>
              </tr>
            ))} 
              </tbody>


            </table>

      
          

           <table className="ScoreCardTable">
              <thead>
               
                <tr>
                    <th id="hh1"colspan="7">Bowling : {ScoreCard.teeam2} </th>
                </tr>
                <tr className="trtag">
                    <th>Bowlers </th>
                    <th>Over</th>
                    <th>run</th>
                    <th>Wicket</th>
                    <th>Economy</th>
                   
                </tr>
              </thead>
              <tbody>
              {BowlingCard.team1_Bowlers_List && BowlingCard.team1_Bowlers_List.map((Bowlers, index) => (
              <tr key={index}>
                <td><Link to={`/PlayerStats2/${Bowlers}`}>{Bowlers}</Link></td>
                <td>{BowlingCard.team1_Overs_List[index]}</td>
                <td>{BowlingCard.team1_Runs_List[index]}</td>
                <td>{BowlingCard.team1_Wickets_List[index]}</td>
                <td>{BowlingCard.team1_Economy_List[index]}</td>
               
              </tr>
            ))} 
              </tbody>


            </table>
            <br></br>
            <br></br>




            <table className="ScoreCardTable">
              <thead>
               
                <tr>
                    <th id="hh1" colspan="7">{ScoreCard.teeam2}</th>
                </tr>
                <tr className="trtag">
                    <th>Batsman Name</th>
                    <th>Runs</th>
                    <th>Balls</th>
                    <th>Strike Rate</th>
                    <th>Fours</th>
                    <th>Sixes</th>
                    <th>Out by</th>
                </tr>
              </thead>
              <tbody>
              {ScoreCard.player_Name_Team2 && ScoreCard.player_Name_Team2.map((player, index) => (
              <tr key={index}>
                <td><Link to={`/PlayerStats2/${player}`}>{player}</Link></td>
                <td>{ScoreCard.player_Runs_Team2[index]}</td>
                <td>{ScoreCard.player_Balls_Team2[index]}</td>
                <td>{ScoreCard.player_StrikeRate_Team2[index]}</td>
                <td>{ScoreCard.player_Fours_Team2[index]}</td>
                <td>{ScoreCard.player_Sixes_Team2[index]}</td>
                <td>{ScoreCard.player_BattingStatus_Team2[index]}</td>
              </tr>
            ))} 
              </tbody>


            </table>

           
           

            <table className="ScoreCardTable">
              <thead>
               
                <tr>
                    <th id="hh1"colspan="7">Bowling </th>
                </tr>
                <tr className="trtag">
                    <th>Bowlers </th>
                    <th>Over</th>
                    <th>run</th>
                    <th>Wicket</th>
                    <th>Economy</th>
                   
                </tr>
              </thead>
              <tbody>
              {BowlingCard.team2_Bowlers_List && BowlingCard.team2_Bowlers_List.map((Bowlers, index) => (
              <tr key={index}>
              <td><Link to={`/PlayerStats2/${Bowlers}`}>{Bowlers}</Link></td>
                <td>{BowlingCard.team2_Overs_List[index]}</td>
                <td>{BowlingCard.team2_Runs_List[index]}</td>
                <td>{BowlingCard.team2_Wickets_List[index]}</td>
                <td>{BowlingCard.team2_Economy_List[index]}</td>
               
              </tr>
            ))} 
              </tbody>


            </table>

        </div>





    );
}
export default MatchScoreCard