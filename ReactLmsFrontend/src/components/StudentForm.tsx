
import {useNavigate} from "react-router-dom";
import {useForm} from "react-hook-form";
import {useMutation} from "@tanstack/react-query";
import axios from "axios";

function Form() {
    const navigate = useNavigate();
    const {
        register,
        handleSubmit
    } = useForm();
    const apiCall   = useMutation({
        mutationKey:["SAVE_API_CALL"],
        mutationFn(requestData:any){
            return axios.post("http://localhost:8080/class/save",requestData)
        }
    })
    const onSubmit = (data: any) => {
        console.log(data);//{groundName:""}
        apiCall.mutate(data)
    }
    return (
        <>
            <div className={"main"}>
                <button onClick={() => navigate(-1)}>click here to display user list.</button>
                <form onSubmit={handleSubmit(onSubmit)}>
                    <div>
                        <label>Ground Name</label>
                        <input type={"text"} {...register('className')} />

                        <label>Ground Name</label>
                        <input type={"text"} {...register('fees')} />
                    </div>
                    <div>
                        <input type={"submit"}/>
                    </div>
                </form>
            </div> vb

        </>
    )
}
export default Form;