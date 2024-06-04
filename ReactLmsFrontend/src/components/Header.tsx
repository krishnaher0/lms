import { useNavigate } from 'react-router-dom';



const Header = () => {
    // const [content, setContent] = useState('');
     const navigate = useNavigate();
    //
    // const handleClick = () => {
    //     setContent('Krishna');
    //     navigate('/admin');
    // };
    return (
        <div className="flex flex-col justify-center items-center h-screen">
            <header className="fixed top-0 left-0 w-full bg-blue-600 text-white shadow-lg p-4">
                <div className="flex justify-center space-x-4">
                    <button
                        className="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded"

                    onClick={()=>navigate('/students')}>
                        Button 1
                    </button>
                    <button className="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded">
                        Button 2
                    </button>
                    <button className="bg-yellow-500 hover:bg-yellow-700 text-white font-bold py-2 px-4 rounded">
                        Button 3
                    </button>
                </div>
            </header>
            <main className="pt-20">
                <div className="text-center text-2xl font-bold">

                </div>
            </main>
        </div>
    );
};

export default Header;
