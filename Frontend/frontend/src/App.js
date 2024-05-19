import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header';
import Footer from './components/Footer';
import './App.css'; // Importing global CSS

function App() {
    return (
        <Router>
            <div className="app">
                <Header />
                <main>
                    <Routes>

                    </Routes>
                </main>
                <Footer />
            </div>
        </Router>
    );
}

export default App;
