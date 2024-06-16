import { Routes,Route } from "react-router-dom";
import { BrowserRouter as router } from "react-router-dom";
import Navbar from "./Pages/Navbar";
import TeamPage from "./Pages/TeamPage";
import MatchPage from "./Pages/MatchPage";
import MatchFullDetails from "./Components/MatchFullDetails";
import PlayersStats from "./Components/PlayerStats";
import MatchScoreCard from "./Components/MatchScoreCard";
import PlayerStats2 from "./Components/PlayerStats2";
import CompareTeams from "./Components/CompareTeams";
import TeamDetails from "./Components/TeamDetails";


function App()
{
  return(
    // <div>
    //   <h1>Sonu</h1>
    // </div>
    <Routes>
      <Route path="/" element={<Navbar/>} />
      <Route path="/teampage" element={ <TeamPage/>} />
      <Route path="/matchpage" element={<MatchPage />} />
      <Route path="/matchfulldetails/:temp" element={<MatchFullDetails/>}/>
      <Route path="/players" element={<PlayersStats/>}/>
      <Route path="/MatchScoreCard" element={<MatchScoreCard/>}/>
      <Route path="/PlayerStats2/:temp" element={<PlayerStats2/>}/>
      <Route path="/CompareTeams" element={<CompareTeams/>}/>
      <Route path="/teamDetails/:team" element={<TeamDetails/>}/>
    </Routes>
  );
}
export default App