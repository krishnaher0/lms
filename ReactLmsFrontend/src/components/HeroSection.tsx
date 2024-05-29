import React from 'react';

const HeroSection: React.FC = () => {
    return (
        <section style={styles.hero}>
            <h2>Welcome to My Website</h2>
            <p>This is a simple hero section for a homepage.</p>
        </section>
    );
};

const styles = {
    hero: {
        padding: '50px 20px',
        textAlign: 'center',
        backgroundColor: '#61dafb',
        color: '#282c34',
    } as React.CSSProperties
};

export default HeroSection;