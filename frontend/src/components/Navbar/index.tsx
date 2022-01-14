import { BsGithub as GithubIcon } from "react-icons/bs"
import './styles.css'

function Navbar() {
    return (
        <header>
            <nav className="container">
               <div className="dsmovie-nav-content">
               <h1>DSMovie</h1>
                <a href="https://github.com/fms0102" target="_blank" rel="noreferrer">
                    <div className="dsmovie-contact-container">
                        <GithubIcon size={24}/>
                        <p className="dsmovie-contact-link">/fms0102</p>
                    </div>
                </a>
               </div>
            </nav>
        </header>
    )
}

export default Navbar