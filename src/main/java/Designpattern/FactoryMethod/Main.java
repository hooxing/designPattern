package Designpattern.FactoryMethod;


    interface ImageReader {
        void readImage();
    }

    class GifReader implements ImageReader {
        public void readImage() {
            System.out.println("Reading GIF image.");
        }
    }

    class JpgReader implements ImageReader {
        public void readImage() {
            System.out.println("Reading JPG image.");
        }
    }

    abstract class ImageReaderFactory {
        abstract ImageReader createReader();
    }

    class GifReaderFactory extends ImageReaderFactory {
        ImageReader createReader() {
            return new GifReader();
        }
    }

    class JpgReaderFactory extends ImageReaderFactory {
        ImageReader createReader() {
            return new JpgReader();
        }
    }

    public class Main {
        public static void main(String[] args) {
            ImageReaderFactory gifFactory = new GifReaderFactory();
            ImageReader gifReader = gifFactory.createReader();
            gifReader.readImage();

            ImageReaderFactory jpgFactory = new JpgReaderFactory();
            ImageReader jpgReader = jpgFactory.createReader();
            jpgReader.readImage();
        }
    }


