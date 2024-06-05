


import './App.css'
import {createBrowserRouter, RouterProvider} from 'react-router-dom'
import Result from "./components/Results.tsx";
import Home from "./components/Home.tsx";
import Admin from "./components/Admin.tsx";
import Attendance from "./components/Attendance.tsx";
import {QueryClient, QueryClientProvider} from '@tanstack/react-query';




function App() {
    const queryClient = new QueryClient()

    return (
        <>
            <QueryClientProvider client={queryClient}>




                <RouterProvider router={
                    createBrowserRouter(
                        [
                            {path: "", element: <Result/>},

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

export default App;
