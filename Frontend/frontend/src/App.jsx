import {useEffect} from "react";
const API="localhost:8080/students/get/45"
const fetchUsers=async ()=>{
    try{
        const res=await fetch(URL)
        const data=await res.json()
        console.log(data)
    } catch(e){
        console.log(e)

    }
}
const App=()=>{
    useEffect(()=>{
        fetchUsers();
    },[])

}
export default App;