import './App.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import Home from "./components/Home.tsx";
import Header from "./components/Header.tsx";
import Admin from "./components/Admin.tsx";
import Sidebar from "./components/Sidebar.tsx";
import Attendance from "./components/Attendance.tsx";


const queryClient = new QueryClient()


function App() {

    return (
        <>
            <QueryClientProvider client={queryClient}>
                <Header/>
                <Sidebar/>


                <RouterProvider router={
                    createBrowserRouter(
                        [

                            {path: "/home", element: <Home/>},
                            {path: "/admin", element: <Admin/>},
                            {path: "/students", element: <Attendance/>}


                        ]
                    )
                }/>
            </QueryClientProvider>
        </>
    )
}

export default App
