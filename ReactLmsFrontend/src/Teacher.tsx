import './components/styles/sidebar.css';
import './components/styles/header.css';
import './components/styles/general.css';

function Teacher() {
    return (
        <>
            <html lang="en">
            <head>
                <meta charSet="UTF-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

                <title>Schoolify:Teacher</title>

                <link rel="preconnect" href="https://fonts.googleapis.com"/>
                <link rel="preconnect" href="https://fonts.gstatic.com"/>
                <link
                    href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Nunito:ital,wght@0,200..1000;1,200..1000&display=swap"
                    rel="stylesheet"/>

                <link rel="stylesheet" href="components/styles/sidebar.css"/>
                <link rel="stylesheet" href="components/styles/header.css"/>
            </head>
            <body>
            <header className="header">

                <div className="left-area">
                    <div className="header_obj">
                        <p>DashBoard</p>
                    </div>
                    <div className="header_obj">
                        <p>Notices</p>
                    </div>
                    <div className="header_obj">
                        <p>Request</p>
                    </div>
                </div>

                <div className="right-area">
                    <div className="notif-icon">
                        <img src={"/assets/icons/notif-bell-icon-white.svg"}/>
                    </div>

                    <div className="profile-icon">
                        <img className="profile" src="/assets/icons/profile-circle-icon-white.svg"/>
                        <p>Abhinav Dhakal</p>
                        <img className="arrow-icon" src="/assets/icons/arrow-white.svg" alt=""/>
                    </div>
                </div>
            </header>

            <section className="sidebar">
                <div className="logo">
                    <img className={"logoo"} src="/assets/images/logoo.png" alt="Schoolify"/>
                </div>
                <div className="contents">
                    <div className="sidebar_obj">
                        <img src="/assets/icons/tasks-app-svgrepo-com.svg" alt=""/>
                        <p>Assign Tasks</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/learn-svgrepo-com.svg" alt=""/>
                        <p>Courses</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/a-best-test-result-svgrepo-com.svg" alt=""/>
                        <p>Publish Results</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/invoice-ledger-line-svgrepo-com.svg" alt=""/>
                        <p>Attendance</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/feedback-svgrepo-com.svg" alt=""/>
                        <p>Feedback</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/notice-push-svgrepo-com.svg" alt=""/>
                        <p>Notices</p>
                    </div>
                    <div className="sidebar_obj">
                        <img src="/assets/icons/credit-card-payment-svgrepo-com.svg" alt=""/>
                        <p>Salary</p>
                    </div>
                </div>

            </section>
            </body>
            </html>
        </>
)
}
export default Teacher;