function App() {
    return (
        <>
            <html>
            <head>
                <title>Learning Management System</title>
                <link rel="preconnect" href="https://fonts.googleapis.com"></link>
                    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin></link>
                        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet"></link>
                            <link rel="stylesheet" href="css/general.css"></link>
                                <link rel="stylesheet" href="css/header.css"></link>
                                    <link rel="stylesheet" href="css/sidebar.css"></link>
            </head>
            <body>
            <header class="header">
                <div class="left-area">
                    <div class="text">
                        <img src="icons/logoo.png" alt=""></img>
                    </div>
                </div>

                <div class="middle-area">
                    <div class="admin-label">
                        <p>ADMINISTRATOR</p>
                    </div>

                    <div class="academic-year">
                        <p>Academic Year 2024-2025</p>
                    </div>
                </div>

                <div class="right-area">
                    <div class="notif-icon">
                        <img src="icons/notif-bell-icon.svg" alt=""></img>
                    </div>

                    <div class="profile-icon">
                        <img src="icons/profile-circle-icon.svg"></img>
                    </div>
                </div>


            </header>

            <section class="sidebar">
                <div class="sidebar_obj">
                    <img src="icons/dashboard-svgrepo-com.svg" alt=""></img>
                        <p>DashBoard</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/add-square-svgrepo-com-2.svg" alt=""></img>
                        <p>Add Student</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/add-square-svgrepo-com-2.svg" alt=""></img>
                        <p>Add Teacher</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/invoice-ledger-line-svgrepo-com.svg" alt=""></img>
                        <p>Ledger</p>
                </div>
                <div class="sidebar_obj">
                    <p>Teacher Attendance</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/request-new-svgrepo-com.svg" alt=""></img>
                        <p>Request</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/notice-push-svgrepo-com.svg" alt=""></img>
                        <p>Add Notice</p>
                </div>
                <div class="sidebar_obj">
                    <img src="icons/credit-card-payment-svgrepo-com.svg" alt=""></img>
                        <p>Fee History</p>
                </div>
            </section>
            </body>
            </html>
    </>
    )
}

export default App;