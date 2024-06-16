import React, { useState, useEffect } from 'react';
import './MatchDetailComponent.css'
import MatchFullDetails from './MatchFullDetails';
import { Link } from 'react-router-dom';




 
function MatchDetailComponent() {
  const [year, setYear] = useState(''); // State variable to store the user-inputted year
  const [IPLMatch, setIPLMatch] = useState(null);
  const [loading, setLoading] = useState(true);
 // const navigate = useNavigate();

  // function chaneHandler(event)
  // {
  // setYear(event.target.value);
  // }

  const clickhadler =(year)=>{

     setYear(year);
    console.log(year);
  }
  function getMatchExtendedDetail(match)
  {
    MatchFullDetails(match);
   // console.log(match);
   //console.log("SSSSSs");
  // navigate(/matchfulldetails/${matchId});
    
  }
  


  useEffect(  () => {
    const fetchData = async () => {

      try {

        const response = await fetch(`http://localhost:8011/all2/MatchesOf/${year}`);
        //const response = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all2/MatchesOf/${year}`);
       // console.log(response);

        const data = await response.json();
       // console.log("done");
       // console.log(data);
        //console.log("print");
        setIPLMatch(data);
      } catch (error) {
        console.error('Error fetching data:', error.message);
      } finally {
        setLoading(false);
      }
    };

   

   if (year.length === 4) {
     fetchData();
   }

    //console.log("inside ");
  }, [year]);

  return (
    <div>
    <button className="bbbb" onClick={ ()=>clickhadler("2022")}>2022</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2021")}>2021</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2020")}>2020</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2019")}>2019</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2018")}>2018</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2017")}>2017</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2016")}>2016</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2015")}>2015</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2014")}>2014</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2013")}>2013</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2012")}>2012</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2011")}>2011</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2010")}>2010</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2009")}>2009</button>
          <button className="bbbb" onClick={ ()=>clickhadler("2008")}>2008</button>
   <div id="ddd">
      {/* <form >
        <label>
          Enter Year: &nbsp; &nbsp; &nbsp;
          <input
            type="text"
            value={year}
            onChange={chaneHandler}
          />
        </label>
      </form> */}

          
      </div>

      {loading ? (
        <p></p>
      ) : (
        <div>
           <div id="ddd"><h2>IPL Matches of {year}</h2> </div>
          <table>
                     <thead>
                       
                         {/* <th>Id</th> */}
                         <th>Date</th>
                         <th>Venue</th>
                         <th>Teams</th>
                         <th>Result</th>
                         <th>WonBy</th>
                         <th>Player Of the Match</th>

                       
                     </thead>
                     <tbody>
  {IPLMatch && IPLMatch.map(match => (
    <tr key={match.matchId}>
      {/* <td>
        <Link to={/matchfulldetails/${match.matchId}}>{match.matchId}</Link>
      </td> */}
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.date}</Link></td>
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.venue}</Link></td>
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.team1} <b>vs</b> {match.team2}</Link></td>
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.result}</Link></td>
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.margin}  {match.wonByRunsOrWicket}</Link></td>
      <td><Link to={`/matchfulldetails/${match.matchId}`}>{match.playerOFMatch}</Link></td>
    </tr>
  ))}
</tbody> 
</table>
                  
        </div>

      )}
     
      
    </div>
  );
}

export default MatchDetailComponent;