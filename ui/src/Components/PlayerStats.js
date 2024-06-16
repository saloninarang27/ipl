import React, { useEffect, useState } from 'react';
 import './PlayerStats.css'

// function PlayersStats()
// {
    
//     let[player,setPlayer]=useState('');
//     const[playerData,setPlayerData]=useState("")
//     const[playerData2,setPlayerData2]=useState("")

//     function changeHandler(event){

//      setPlayer(event.target.value);
//      console.log(event.target.value);
     
//     }

//     useEffect( ()=>{
       
//       const  fetchData=async()=>{
//         try{

//             // const response = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all3/Search/${player});
//             // const response2 = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all4/Search/${player});
//              const response=await fetch(`http://localhost:8011/all3/Search/${player}`);
//              const response2=await fetch(`http://localhost:8011/all4/Search/${player}`);

            
//             //console.log(response);
//             if(!response.ok || !response2.ok)
//             {throw new Error('Network response was not ok');}
      
//             const data= await response.json();
//             const data2= await response2.json();
//             console.log(data);
//             console.log(data2);
//             setPlayerData(data);
//             setPlayerData2(data2);
           
//            }
//            catch(error)
//            {
//                console.error('Error fetching data:', error.message);
//            }
   

//       };
     
//       if(player)
//       { console.log(player);
//         fetchData();
//       }

//     },[player]

//     );

   
//     return(

//         <div>
//         <h1 id="hh1">PlayersStats</h1>
//         <form>
//         <label>
//            Enter Player Name :
//            <input type="text" value={player} onChange={changeHandler} />
//         </label>
        
//       </form>


//       <div id="playersRecord">
// <label >Browse Player:</label>    
// <select id="players" onChange={changeHandler}>
// <option value="" disabled hidden>choose Player</option>
//   <option value="" disabled hidden>choose Player</option>
//   <option>Players</option>
//   <option value="Virat Kohli" >Virat Kohli</option>
//   <option value="MS Dhoni">MS Dhoni</option>
//   <option value="Rohit Sharma">Rohit Sharma</option>
//   <option value="Yuvraj Singh">Yuvraj Singh</option>
//   <option value="Shubman Gill">Shubhman Gill</option>
//   <option value="AB de Villiers">AB de Villiers</option>
//   <option value="Zaheer Khan">Zaheer Khan</option>
//   <option value="Sachin Tendulkar">Sachin Tendulkar</option>
//   <option value="Harbhajan Singh">Harbhajan Singh</option>

  
// </select>
// </div> 
// <br></br>
//       {/*<button type="button" onClick={changeHandler(temp)}> Search!</button> */}
    

//         <table className='playersRecord'>
//             <thead>
//                 <tr>
//                     <th id="hh1" colspan="2">{playerData.name} <br></br>Batting</th>
                    
//                 </tr>
//                 <tr>
//                     <th>Teams</th>
//                     <td>{playerData.teams  }</td>
                  
//                 </tr>
//                 <tr>
//                     <th>Matches</th>
//                     <td>{playerData.matches}</td>
//                 </tr>
//                 <tr>
//                     <th>Runs</th>
//                     <td>{playerData.runs}</td>
//                 </tr>
//                 <tr>
//                     <th>Fifty</th>
//                     <td>{playerData.halfCentury}</td>
//                 </tr>
//                 <tr>
//                     <th>hundred</th>
//                     <td>{playerData.century}</td>
//                 </tr>
//                 <tr>
//                     <th>Highest</th>
//                     <td>{playerData.highest}</td>
//                 </tr>
                
//             </thead>
//         </table>

//         <table className='playersRecord'>
//             <thead>
//                 <tr className='playername'>
//                     <th id="hh1" colspan="2">Bowling</th>
                    
//                 </tr>
                
//                 <tr>
//                     <th>Innings</th>
//                     <td>{playerData2.innings}</td>
//                 </tr>
//                 <tr>
//                     <th>Wicket</th>
//                     <td>{playerData2.wickets}</td>
//                 </tr>
//                 <tr>
//                     <th>Balls</th>
//                     <td>{playerData2.balls}</td>
//                 </tr>
//                 <tr>
//                     <th>Maidens</th>
//                     <td>{playerData2.maidens}</td>
//                 </tr>

                 
//                  <tr>
//                     <th>Best Figures</th>
//                     <td>{playerData2.bestFigure}</td>
//                 </tr>
                
               
                
                
//             </thead>
//         </table>
       
//         </div>
//     );
// }
// export default PlayersStats
function PlayersStats ()
{
    let[player,setPlayer]=useState('');
        const[playerData,setPlayerData]=useState("")
        const[playerData2,setPlayerData2]=useState("")
    
        function changeHandler(event){
    
         setPlayer(event.target.value);
         console.log(event.target.value);
         
        }
    
        useEffect( ()=>{
           
          const  fetchData=async()=>{
            try{
    
                // const response = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all3/Search/${player});
                // const response2 = await fetch(${process.env.REACT_APP_API_ROOT_URL}/all4/Search/${player});
                 const response=await fetch(`http://localhost:8011/all3/Search/${player}`);
                 const response2=await fetch(`http://localhost:8011/all4/Search/${player}`);
    
                
                //console.log(response);
                if(!response.ok || !response2.ok)
                {throw new Error('Network response was not ok');}
          
                const data= await response.json();
                const data2= await response2.json();
                console.log(data);
                console.log(data2);
                setPlayerData(data);
                setPlayerData2(data2);
               
               }
               catch(error)
               {
                   console.error('Error fetching data:', error.message);
               }
       
    
          };
         
          if(player)
          { console.log(player);
            fetchData();
          }
    
        },[player]
    
        );
    return(
        <div>
             <h1 id="hh1">PlayersStats</h1>
       <form>
       <label>
          Enter Player Name :
           <input type="text" value={player} onChange={changeHandler} />
        </label>
        
       </form>

             <div id="playersRecord">
   <label >Browse Player:</label>    
<select id="players" onChange={changeHandler}>
<option value="" disabled hidden>choose Player</option>
   <option value="" disabled hidden>choose Player</option>
   <option>Players</option>
  <option value="Virat Kohli" >Virat Kohli</option>
   <option value="MS Dhoni">MS Dhoni</option>
   <option value="Rohit Sharma">Rohit Sharma</option>
   <option value="Yuvraj Singh">Yuvraj Singh</option>
   <option value="Shubman Gill">Shubhman Gill</option>
  <option value="AB de Villiers">AB de Villiers</option>
   <option value="Zaheer Khan">Zaheer Khan</option>
  <option value="Sachin Tendulkar">Sachin Tendulkar</option>
   <option value="Harbhajan Singh">Harbhajan Singh</option>

  
 </select>
 </div> 
 <br></br>

 <table className='playersRecord'>
            <thead>
                 <tr>
                     <th id="hh1" colspan="2">{playerData.name} <br></br>Batting</th>
                    
                 </tr>
                 <tr>
                    <th>Teams</th>
                     <td>{playerData.teams  }</td>
                  
                 </tr>
                 <tr>
                     <th>Matches</th>
                     <td>{playerData.matches}</td>
                 </tr>
                 <tr>
                    <th>Runs</th>
                     <td>{playerData.runs}</td>
                 </tr>
                 <tr>
                     <th>Fifty</th>
                     <td>{playerData.halfCentury}</td>
                 </tr>
                <tr>
                    <th>hundred</th>
                    <td>{playerData.century}</td>
                 </tr>
                 <tr>
                     <th>Highest</th>
                     <td>{playerData.highest}</td>
                 </tr>
                
             </thead>
         </table>

        <table className='playersRecord'>
            <thead>
                <tr className='playername'>
                     <th id="hh1" colspan="2">Bowling</th>
                    
                 </tr>
                
                 <tr>
                     <th>Innings</th>
                    <td>{playerData2.innings}</td>
                 </tr>
                 <tr>
                    <th>Wicket</th>
                     <td>{playerData2.wickets}</td>
                </tr>
                <tr>
                    <th>Balls</th>
                     <td>{playerData2.balls}</td>
                </tr>
                <tr>
                     <th>Maidens</th>
                   <td>{playerData2.maidens}</td>
               </tr>

                 
                <tr>
                   <th>Best Figures</th>
                    <td>{playerData2.bestFigure}</td>
                </tr>
                
               
                
                
           </thead>
        </table>






        </div>


    );
}
export default PlayersStats;