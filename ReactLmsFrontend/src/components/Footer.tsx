
import React from 'react';

const Footer: React.FC = () => {
    return (
        <footer style={styles.footer}>
            <p>&copy; 2024 My Website. All rights reserved.</p>
        </footer>
    );
};

const styles = {
    footer: {
        padding: '10px 20px',
        backgroundColor: '#282c34',
        color: 'white',
        textAlign: 'center',
        position: 'fixed',
        bottom: 0,
        width: '100%'
    } as React.CSSProperties
};

export default Footer;

