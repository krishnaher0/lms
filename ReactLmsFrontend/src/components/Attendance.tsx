import {useNavigate} from "react-router-dom";
import {useQuery} from "@tanstack/react-query";
import axios from "axios";
import StudentForm from "./StudentForm.tsx";
// import Header from "./Header.tsx";

function Attendance() {

    const navigate = useNavigate();

    const getData = useQuery({
        queryKey: ["GET_CLASS_DATA"],
        queryFn() {
            return axios.get("http://localhost:8080/class/get")
        },
        select(data) {
            return data?.data?.data
        }

    })

    console.log(getData?.data)

    return (
        <>
            {/*<Header/>*/}


            <button onClick={() => navigate("/students")}>click here to add new user.</button>
            <table border={1}>
                <thead>
                <tr>
                    <th>Id</th>
                    <th>student name</th>
                </tr>
                </thead>
                <tbody>
                {getData?.data?.map(i=>(
                    <tr key={i?.id}>
                        <td>
                            {i?.className}
                        </td>
                        <td>
                            {i?.fees}
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>

            <StudentForm/>
        </>
    )
}

export default Attendance ;