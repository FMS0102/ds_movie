import {
    VscStarFull as StarFull,
    VscStarHalf as StarHalf,
    VscStarEmpty as StarEmpty
} from 'react-icons/vsc'
import './styles.css'

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    )
}

export default MovieStars