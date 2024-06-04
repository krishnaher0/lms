
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import Home from "./components/Home.tsx";
import Admin from "./components/Admin.tsx";
import Attendance from "./components/Attendance.tsx";
import AdminSScreen from "./screen/Admin's Screen.tsx";
// import Default from "./components/Default.tsx";


const queryClient = new QueryClient()


function App() {

    return (
        <>
            <QueryClientProvider client={queryClient}>




                <RouterProvider router={
                    createBrowserRouter(
                        [
                            {path: "", element: <AdminSScreen/>},

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
