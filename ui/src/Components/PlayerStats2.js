import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom"
// import { useParams } from "react-router-dom";
 import './PlayerStats2.css'
// function PlayerStats2()
// { let {temp}=useParams();
//   console.log(temp);
//   let[player,setPlayer]=useState('');
//   const[playerData,setPlayerData]=useState("")
//   const[playerData2,setPlayerData2]=useState("")



//   useEffect( ()=>{
       
//     const  fetchData=async()=>{
//       try{

//           // const response = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all3/Search/${player}`);
//           // const response2 = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all4/Search/${player}`);
//           const response=await fetch(`http://localhost:8011/all3//Search/${player}`);
//           const response2 =await fetch(`http://localhost:8011/all4/Search/${player}`);
          
//           //console.log(response);
//           if(!response.ok|| !response2.ok )
//           {throw new Error('Network response was not ok');}
    
//           const data= await response.json();
//           const data2= await response2.json();

//           console.log(data);
//           setPlayerData(data);
//           console.log(data2)
//           setPlayerData2(data2);

         
//          }
//          catch(error)
//          {
//              console.error('Error fetching data:', error.message);
//          }
 


//     };

//     player=temp;
   
//     if(player)
//     { console.log(player);
//       fetchData();
//     }

//   },[player]

//   );

  

//     return(
//         <div>
//              <h1 id="hh1">{playerData.name}</h1>

        //     <table className='playersRecord'>
        //     <thead>
        //         <tr className='playername'>
        //             <th id="hh1" colspan="2">Batting</th>
                    
        //         </tr>
        //         <tr>
        //             <th>Teams</th>
        //             <td>{playerData.teams}</td>
                  
        //         </tr>
        //         <tr>
        //             <th>Matches</th>
        //             <td>{playerData.matches}</td>
        //         </tr>
        //         <tr>
        //             <th>Runs</th>
        //             <td>{playerData.runs}</td>
        //         </tr>
        //         <tr>
        //             <th>Fifty</th>
        //             <td>{playerData.halfCentury}</td>
        //         </tr>
        //         <tr>
        //             <th>hundred</th>
        //             <td>{playerData.century}</td>
        //         </tr>
        //         <tr>
        //             <th>Highest</th>
        //             <td>{playerData.highest}</td>
        //         </tr>
                
        //     </thead>
        // </table>
        

        // <table className='playersRecord'>
        //     <thead>
        //         <tr className='playername'>
        //             <th id="hh1" colspan="2">Bowling</th>
                    
        //         </tr>
                
        //         <tr>
        //             <th>Innings</th>
        //             <td>{playerData2.innings}</td>
        //         </tr>
        //         <tr>
        //             <th>Wicket</th>
        //             <td>{playerData2.wickets}</td>
        //         </tr>
        //         <tr>
        //             <th>Balls</th>
        //             <td>{playerData2.balls}</td>
        //         </tr>
        //         <tr>
        //             <th>Maidens</th>
        //             <td>{playerData2.maidens}</td>
        //         </tr>

                 
        //          <tr>
        //             <th>Best Figures</th>
        //             <td>{playerData2.bestFigure}</td>
        //         </tr>
                
               
                
                
        //     </thead>
        // </table>
//         </div>
//     )
// }
// export default PlayerStats2;







function PlayerStats2 ()
{
  let {temp}=useParams();
  console.log(temp);
   let[player,setPlayer]=useState('');
   const[playerData,setPlayerData]=useState("")
   const[playerData2,setPlayerData2]=useState("")
   useEffect( ()=>{
       
        const  fetchData=async()=>{
          try{
    
              // const response = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all3/Search/${player}`);
              // const response2 = await fetch(`${process.env.REACT_APP_API_ROOT_URL}/all4/Search/${player}`);
              const response=await fetch(`http://localhost:8011/all3/Search/${player}`);
              const response2 =await fetch(`http://localhost:8011/all4/Search/${player}`);
              
              //console.log(response);
              if(!response.ok|| !response2.ok )
              {throw new Error('Network response was not ok');}
        
              const data= await response.json();
              const data2= await response2.json();
    
              console.log(data);
              setPlayerData(data);
              console.log(data2)
              setPlayerData2(data2);
    
             
             }
             catch(error)
             {
                 console.error('Error fetching data:', error.message);
             }
     
    
    
        };
    
        player=temp;
       
        if(player)
        { console.log(player);
          fetchData();
        }
    
      },[player]
    
      );
    
  return(
    <div>
       <h1 id="hh1">{playerData.name}</h1>
      {/* <h1 id="hh1">Sonu</h1> */}
      <table className='playersRecord'>
            <thead>
                <tr className='playername'>
                    <th id="hh1" colspan="2">Batting</th>
                    
                </tr>
                <tr>
                    <th>Teams</th>
                    <td>{playerData.teams}</td>
                  
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
  )
}
export default PlayerStats2;