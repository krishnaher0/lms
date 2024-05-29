import React from 'react';

const Header: React.FC = () => {
    return (
        <header style={styles.header}>
            <h1>My Website</h1>
            <nav>
                <a href="#home">Home</a>
                <a href="#about">About</a>
                <a href="#contact">Contact</a>
            </nav>
        </header>
    );
};

const styles = {
    header: {
        padding: '10px 20px',
        backgroundColor: '#282c34',
        color: 'white',
        display: 'flex',
        justifyContent: 'space-between',
        alignItems: 'center'
    } as React.CSSProperties
};

export default Header;