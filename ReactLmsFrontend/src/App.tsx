

import './App.css'
import Header from "./components/Header.tsx";
import Footer from "./components/Footer.tsx";
import HomePage from "./components/HomePage.tsx";

function App() {
  // const [count, setCount] = useState(0)

  return (
    <>
      <div>
          <Header />
          <HomePage />
          <Footer />

      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
